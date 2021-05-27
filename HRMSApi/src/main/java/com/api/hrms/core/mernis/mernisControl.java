package com.api.hrms.core.mernis;

import java.rmi.RemoteException;
import java.util.Date;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import tr.gov.nvi.tckimlik.WS.KPSPublicSoap;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

@Component
public class mernisControl implements MernisControlService {
	
	@Override
	public boolean MernisKimlikNuKontrol(String kimlikNu,String ad,String soyad,Date dogumTarihi){
		boolean status = false;
		KPSPublicSoapProxy kimlikDogrula = new KPSPublicSoapProxy();
		long tcKimlikNu = Long.parseLong(kimlikNu);
		
		try {
			status = kimlikDogrula.TCKimlikNoDogrula(tcKimlikNu, ad, soyad, 2003);
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		
		return status;
	}
	

}
