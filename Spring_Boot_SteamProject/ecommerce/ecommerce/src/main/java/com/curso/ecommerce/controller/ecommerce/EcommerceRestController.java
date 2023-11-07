package com.curso.ecommerce.controller.ecommerce;

import com.curso.ecommerce.client.steam.SteamGames;
import com.curso.ecommerce.domain.game.Games;
import com.curso.ecommerce.domain.steam.dto.SteamDTO;
import com.curso.ecommerce.service.ecommerce.EcommerceService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
public class EcommerceRestController {
    private  final SteamGames steamGames;

    private final EcommerceService ecommerceService;

        @GetMapping(path = "/jogos")
        public ResponseEntity<?> getGamesByName(@RequestParam (required = false) String name) {
            return ResponseEntity.ok(steamGames.getGamesByName(name));
        }

        @GetMapping(path = "/v1/ecommerce/games")
        public Games getEcommerce(@RequestParam (required = false) String name) {
            return ecommerceService.getGameByName(name);
        }
        @PostMapping(path = "/v1/ecommerce/games")
        public void createGames(@RequestBody Games games) {
            ecommerceService.createGames(games);
        }
        @DeleteMapping(path = "/v1/ecommerce/games")
            public String deleteGames(@RequestParam (required = false) Games games) {
            return ecommerceService.deleteGames(games);
        }
        @PutMapping(path = "/v1/ecommerce/games")
        public Games updateGames(@RequestBody Games games) {
            return ecommerceService.updateGames(games);
        }
}
