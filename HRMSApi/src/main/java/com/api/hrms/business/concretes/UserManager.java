package com.api.hrms.business.concretes;

import java.rmi.RemoteException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.hrms.business.abstracts.UserService;
import com.api.hrms.core.email.EmailConfirmControl.concretes.EmailConfirmControl;
import com.api.hrms.core.email.EmailControl.concretes.EmailControl;
import com.api.hrms.core.email.EmailDomainControl.EmailDomainControl;
import com.api.hrms.core.email.EmailRegexControl.concretes.EmailRegex;
import com.api.hrms.core.identity.concretes.IdentityControl;
import com.api.hrms.core.mernis.mernisControl;
import com.api.hrms.core.password.PasswordControl;
import com.api.hrms.core.results.Result;
import com.api.hrms.core.results.error.ErrorDataResult;
import com.api.hrms.core.results.success.SuccessDataResult;
import com.api.hrms.dataAccess.abstracts.EmployerDao;
import com.api.hrms.dataAccess.abstracts.JobPositionDao;
import com.api.hrms.dataAccess.abstracts.JobSeekerDao;
import com.api.hrms.dataAccess.abstracts.UserDao;
import com.api.hrms.entities.concretes.employer_users;
import com.api.hrms.entities.concretes.job_seeker_users;
import com.api.hrms.entities.concretes.system_users;
import com.api.hrms.entities.concretes.user;

@Service
public class UserManager implements UserService{

	
	private UserDao userdao;
	private JobSeekerDao jobseekerdao;
	private EmployerDao employerDao;
	
	@Autowired
	public UserManager(UserDao userDao,JobSeekerDao jobseekerdao,EmployerDao employerDao) {
		super();
		this.userdao = userDao;
		this.jobseekerdao = jobseekerdao;
		this.employerDao = employerDao;
	}
	
	
	@Override
	public Result addEmployerUser(employer_users user,EmailRegex regexControl,EmailControl emailControl,EmailDomainControl emailDomainControl,PasswordControl passwordControl) {
		if(!regexControl.Control(user.getEmail())) {
			return new ErrorDataResult<>("Belirtilen e-posta adresi geçersiz.");
		}
		else if(!emailControl.EmailControl(user.getEmail())) {
			return new ErrorDataResult<user>("Belirtilen e-posta adresi başka kullanıcı tarafından kullanılıyor.",user);
		}
		else if(!emailDomainControl.EmailDomainControl(user.getEmail(), user.getWeb_adress())) {
			return new ErrorDataResult<user>("Belirtilen e-posta adresi ile domain eşleşmiyor.");
		}
		else if(!passwordControl.PasswordControlAbs(user.getPassword(), user.getRepassword())) {
			return new ErrorDataResult<user>("Şifreler eşleşmiyor");
		}
		else {
			this.userdao.save(user);
			this.employerDao.save(user);
			return new SuccessDataResult<user>("Kayıt Tamamlandı", user);
		}
	}

	@Override
	public Result addJobSeekerUser(job_seeker_users user, EmailRegex regexControl,EmailControl emailControl, IdentityControl identityControl,mernisControl mernisControl,PasswordControl passwordControl) {
		
		if(!user.getEmail().equals("") && !user.getFirstName().equals("") && !user.getIdentityNumber().equals("") && !user.getLastName().equals("") && !user.getBirtOfDate().equals(null) &&
			!user.getPassword().equals("") && !user.getRepassword().equals("")){
			
			if(regexControl.Control(user.getEmail()) == false) {
				return new ErrorDataResult<>("Belirtilen e-posta adresi geçersiz.");
			}
			else if(emailControl.EmailControl(user.getEmail()) == false) {
				return new ErrorDataResult<user>("Belirtilen e-posta adresi başka kullanıcı tarafından kullanılıyor.",user);
			}
			else if(!identityControl.IdentityControl(user.getIdentityNumber())) {
				return new ErrorDataResult<>("Belirtilen TC Kimlik Numarası başkası tarafından kullanılıyor");
			}
			else if(!mernisControl.MernisKimlikNuKontrol(user.getIdentityNumber(), user.getFirstName(), user.getLastName(), user.getBirtOfDate())) {
				return new ErrorDataResult<>("Bilgilerinizi kontrol edin.Tc kimlik numarasına sahip insan bulunamadı.");
			}
			else if(!passwordControl.PasswordControlAbs(user.getPassword(), user.getRepassword())) {
				return new ErrorDataResult<user>("Şifreler eşleşmiyor");
			}
			else {
				this.userdao.save(user);
				this.jobseekerdao.save(user);
				return new SuccessDataResult<user>("Kayıt Tamamlandı", user);
			}
			
			
		}
		else {
			return new ErrorDataResult<>("Tüm alanlar zorunludur.");
		}
		
		}
	
	@Override
	public Result addSystemUser(system_users user,PasswordControl passwordControl) {
		if(!passwordControl.PasswordControlAbs(user.getPassword(), user.getRepassword())) {
			return new ErrorDataResult<user>("Şifreler eşleşmiyor");
		}
		else {
			this.userdao.save(user);
			return new SuccessDataResult<user>("Kayıt Tamamlandı", user);
		}
		
	}




	

	@Override
	public List<user> getUsers() {
		return this.userdao.findAll();
	}

}
