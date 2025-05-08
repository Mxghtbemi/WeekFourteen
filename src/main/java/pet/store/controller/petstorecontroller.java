
package pet.store.controller;

import org.springframework.beans.factory.annotation.Autowired;

@RestController;
@RequestMapping("/pet_store")
@Slf4j

public class PetStoreController {
	@AutoWired
	private PetStoreService petStoreService;
	
}
