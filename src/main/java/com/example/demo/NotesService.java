package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NotesService {
	@Autowired
	NotesRepository notesRepository;
	public List<Notes> getAllNotes()   
	{  
	List<Notes> notes = new ArrayList<Notes>();  
	notesRepository.findAll().forEach(notes1 -> notes.add(notes1));  
	return notes;  
	}
    public Notes getNotesById(int id) {
		
		return notesRepository.findById(id).get();
	}
	public void saveOrUpdate(Notes notes) {
		notesRepository.save(notes);
		
	}
	public void delete(int id) {
		notesRepository.deleteById(id);
		
	}


}
