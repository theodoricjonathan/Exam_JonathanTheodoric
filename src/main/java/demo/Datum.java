package demo;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "ability",
        "name",
        "baseExperience",
        "gameIndex"
})

public class Datum {

        @JsonProperty("ability")
        private String ability;
        @JsonProperty("name")
        private String pokemonName;
        @JsonProperty("baseExperience")
        private String base_experience;
        @JsonProperty("gameIndex")
        private String game_index;

        @JsonProperty("ability")
        public String getAbility() {
            return ability;
        }

        @JsonProperty("ability")
        public void setAbility(String ability) {
            this.ability = ability;
        }

        @JsonProperty("name")
        public String getPokemonName() {
            return pokemonName;
        }

        @JsonProperty("name")
        public void setPokemonName(String pokemonName) {
            this.pokemonName = pokemonName;
        }

        @JsonProperty("baseExperience")
        public String getBase_experience() {
            return base_experience;
        }

        @JsonProperty("baseExperience")
        public void setBase_experience(String base_experience) {
            this.base_experience = base_experience;
        }

        @JsonProperty("gameIndex")
        public String getGame_index() {
            return game_index;
        }

        @JsonProperty("gameIndex")
        public void setGame_index(String game_index) {
            this.game_index = game_index;
        }

    }
