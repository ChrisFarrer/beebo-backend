package com.beebo.beebo_backend.JournalServices;

import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/vi/journals")
public class JournalController{

    private final JournalService journalService;
    @GetMapping("/fetchAll")
    public List<Journal> fetchAllJournals() {
        return journalService.getAllJournals();
    }

    @GetMapping("/fetchByID")
    public Optional<Journal> fetchJournal(@RequestParam String jID) {
        return journalService.getJournal(jID);
    }

    @PostMapping("/postJournal")
    public Journal postJournal(@RequestBody Journal journal) {
        return journalService.addJournal(journal);
    }

    public JournalController(JournalService journalService) {
        this.journalService = journalService;
    }
}
