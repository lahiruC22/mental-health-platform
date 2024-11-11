/**
 * 
 */
package com.xcodelab.journal_service.model;

import java.time.LocalDate;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * 
 */

@Document(collection = "journal-entries")
@AllArgsConstructor
@Data
public class JournalEntry {
	
	@Id
	private String journalId;
	
	private String userName;
	private String content;
	private LocalDate date;
	//private Mood mood; Mood Class should be implemented
	
}
