package Consultas;

import model.subject;
import DAO.SubjectDaoImpl;
import java.util.List;
import DAO.SubjectDAO;

public class editar {

	public static void main(String[] args) {
		
		SubjectDAO dao = new SubjectDaoImpl();
		
		subject subject = new subject();

		subject.setIdsubject(4);
		subject.setSubject("Base de datos Avanzado");
		subject.setCredits(4);
		
		dao.update(subject);
		
		List<subject> rolList = dao.findAll(); 
		for(subject r: rolList) {
			System.out.println(r.getIdsubject());
			System.out.println(r.getSubject());
			System.out.println(r.getCredits());
		}
	}

}
