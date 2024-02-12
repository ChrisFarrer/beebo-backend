package com.beebo.beebo_backend.JournalServices;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class JournalService{

    private final JournalRepository journalRepository;
    public List<Journal> getAllJournals() {
        return journalRepository.findAll();
    }

    public Optional<Journal> getJournal(String jID) {
        return journalRepository.findById(jID);
    }

    public Journal addJournal(Journal journal){
        return journalRepository.save(journal);
    }

    public JournalService(JournalRepository journalRepository) {
        this.journalRepository = journalRepository;
    }
}
