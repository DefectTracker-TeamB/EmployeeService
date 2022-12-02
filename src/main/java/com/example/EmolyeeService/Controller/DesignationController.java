package com.example.EmolyeeService.Controller;

import com.example.EmolyeeService.Dto.AddDesignationDto;
import com.example.EmolyeeService.Dto.DesignationDto;
import com.example.EmolyeeService.Service.DesignationService;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/designations")
public class DesignationController {

	@Autowired
	private DesignationService designationService;

	@PostMapping("/addDesignation")
	public ResponseEntity<Object> addDesignation(@RequestBody @Valid DesignationDto designationDto) {
		designationService.addDesignation(designationDto);
		return ResponseEntity.ok().body("Designation added");
	}

	@PostMapping("/addToDefectTracker")
	public ResponseEntity<Object> addToDefectTracker(@RequestBody AddDesignationDto addDesignationDto) {
		return ResponseEntity.ok().body(designationService.addToDefectTracker(addDesignationDto));
	}

	@GetMapping("/getAllDesignation")
	public ResponseEntity<Object> getAllDesignations() {
		return ResponseEntity.ok(designationService.getAllDesignations());
	}

	@DeleteMapping("/deleteDesignation/{id}")
	public ResponseEntity<Object> deleteDesignations(@PathVariable("id") int id) {

		return ResponseEntity.ok(designationService.deleteDesignation(id));
	}

	@PutMapping("editEmployee/{id}")
	public ResponseEntity<Object> deleteEmpById(@PathVariable("id") int id,
			@RequestBody DesignationDto designationDto) {

		return ResponseEntity.ok(designationService.editDesignation(id, designationDto));
	}

}
