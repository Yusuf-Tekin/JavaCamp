package com.api.hrms.core.mernis;

import java.util.Date;

import org.springframework.stereotype.Service;

@Service
public interface MernisControlService {
	public boolean MernisKimlikNuKontrol(String kimlikNu,String ad,String soyad,Date dogumTarihi);
}
