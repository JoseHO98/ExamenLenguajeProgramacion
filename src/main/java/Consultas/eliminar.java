package Consultas;

import java.util.List;

import DAO.SubjectDAO;
import DAO.SubjectDaoImpl;
import model.subject;

public class eliminar {

	public static void main(String[] args) {
		
		SubjectDAO dao = new SubjectDaoImpl();
		
		dao.delete(6);
		
		List<subject> rolList = dao.findAll(); 
		for(subject r: rolList) {
			System.out.println(r.getIdsubject());
			System.out.println(r.getSubject());
			System.out.println(r.getCredits());
		}
	}
}
