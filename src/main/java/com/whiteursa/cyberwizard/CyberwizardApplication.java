package com.whiteursa.cyberwizard;

import com.whiteursa.cyberwizard.bot.CyberWizard;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;
import org.telegram.telegrambots.updatesreceivers.DefaultBotSession;

@SpringBootApplication
public class CyberwizardApplication {

	public static void main(String[] args) {
		SpringApplication.run(CyberwizardApplication.class, args);
	}

}
