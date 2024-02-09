package DAO;

import java.util.List;

import model.subject;

public interface SubjectDAO {
	public void create(subject subject);
	public void update(subject subject);
	public void delete(Integer id);
	public subject find(Integer id);
	public List<subject> findAll();
}
