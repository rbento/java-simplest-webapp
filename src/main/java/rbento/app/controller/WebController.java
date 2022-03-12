package rbento.app.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.time.LocalDate;
import java.util.concurrent.atomic.AtomicInteger;

@Controller
public class WebController {

	private static final Logger LOG = LoggerFactory.getLogger(WebController.class);
	private static final AtomicInteger REQUEST_COUNTER = new AtomicInteger();

	@GetMapping("/")
	public String index(Model model) {

		REQUEST_COUNTER.incrementAndGet();

		var author = System.getenv("APP_AUTHOR");
		var client = System.getenv("APP_CLIENT");
		var version = System.getenv("APP_VERSION");
		var year = LocalDate.now().getYear();

		LOG.info("index: { requests: {}, author: {}, client: {}, version: {}, year: {}", REQUEST_COUNTER, author, client, version, year);

		model.addAttribute("author", author);
		model.addAttribute("client", author);
		model.addAttribute("version", version);
		model.addAttribute("year", year);

		return "index";
	}
}
