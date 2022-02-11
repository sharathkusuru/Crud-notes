package com.example.demo;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NotesController {
	@Autowired 
	NotesService notesService;
	@GetMapping("/notes")
	private List<Notes> getAllNotes(){
		return notesService.getAllNotes();
	}
	@GetMapping("/notes/{id}")  
	private Notes getNotes(@PathVariable("id") int id)   
	{  
  	return notesService.getNotesById(id); 
	} 
	@PostMapping("/notes")
	private int Savenotes(@RequestBody Notes notes)
	{
	notesService.saveOrUpdate(notes);
	return notes.getId();
	}
	@DeleteMapping("/notes/{id}")  
	private void deleteNotes(@PathVariable("id") int id)
	{
	notesService.delete(id);
	

}
}