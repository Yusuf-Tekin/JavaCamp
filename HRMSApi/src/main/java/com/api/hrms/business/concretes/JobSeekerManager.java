package com.api.hrms.business.concretes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.hrms.business.abstracts.JobSeekerService;
import com.api.hrms.core.email.EmailControl.concretes.EmailControl;
import com.api.hrms.core.email.EmailRegexControl.concretes.EmailRegex;
import com.api.hrms.core.identity.concretes.IdentityControl;
import com.api.hrms.core.mernis.mernisControl;
import com.api.hrms.core.password.PasswordControl;
import com.api.hrms.core.results.Result;
import com.api.hrms.core.results.error.ErrorDataResult;
import com.api.hrms.core.results.success.SuccessDataResult;
import com.api.hrms.dataAccess.abstracts.JobSeekerDao;
import com.api.hrms.entities.concretes.job_seeker_users;
import com.api.hrms.entities.concretes.user;

@Service
public class JobSeekerManager implements JobSeekerService{
	private JobSeekerDao jobseekerdao;

	@Autowired
	public JobSeekerManager(JobSeekerDao jobseekerdao) {
		super();
		this.jobseekerdao = jobseekerdao;
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
				this.jobseekerdao.save(user);
				return new SuccessDataResult<user>("Kayıt Tamamlandı", user);
			}
			
			
		}
		else {
			return new ErrorDataResult<>("Tüm alanlar zorunludur.");
		}
		
		}

}
