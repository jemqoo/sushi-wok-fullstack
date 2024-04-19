package sushiBack.Controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/weblarek")
public class Demo {

    @GetMapping("/a")
    public ResponseEntity<String> hello(){
        return ResponseEntity.ok("Say hello");
    }

    @GetMapping("/b")
    public String helloTwo(){
        return "{\n    \"total\": 10,\n    \"items\": [\n        {\n            \"id\": \"854cef69-976d-4c2a-a18c-2aa45046c390\",\n            \"description\": \"Если планируете решать задачи в тренажёре, берите два.\",\n            \"image\": \"/5_Dots.svg\",\n            \"title\": \"В моем сердце дырка\",\n            \"category\": \"я даун\",\n            \"price\": 750\n        },\n        {\n            \"id\": \"c101ab44-ed99-4a54-990d-47aa2bb4e7d9\",\n            \"description\": \"Лизните этот леденец, чтобы мгновенно запоминать и узнавать любой цветовой код CSS.\",\n            \"image\": \"/Shell.svg\",\n            \"title\": \"Мне нужна таблетка\",\n            \"category\": \"прям пиздец даун\",\n            \"price\": 1450\n        },\n        {\n            \"id\": \"b06cde61-912f-4663-9751-09956c0eed67\",\n            \"description\": \"Будет стоять над душой и не давать прокрастинировать.\",\n            \"image\": \"/Asterisk_2.svg\",\n            \"title\": \"Мамка-таймер\",\n            \"category\": \"софт-скил\",\n            \"price\": null\n        },\n        {\n            \"id\": \"412bcf81-7e75-4e70-bdb9-d3c73c9803b7\",\n            \"description\": \"Откройте эти куки, чтобы узнать, какой фреймворк вы должны изучить дальше.\",\n            \"image\": \"/Soft_Flower.svg\",\n            \"title\": \"Фреймворк куки судьбы\",\n            \"category\": \"дополнительное\",\n            \"price\": 2500\n        },\n        {\n            \"id\": \"1c521d84-c48d-48fa-8cfb-9d911fa515fd\",\n            \"description\": \"Если орёт кот, нажмите кнопку.\",\n            \"image\": \"/mute-cat.svg\",\n            \"title\": \"Кнопка «Замьютить кота»\",\n            \"category\": \"кнопка\",\n            \"price\": 2000\n        },\n        {\n            \"id\": \"f3867296-45c7-4603-bd34-29cea3a061d5\",\n            \"description\": \"Чтобы научиться правильно называть модификаторы, без этого не обойтись.\",\n            \"image\": \"Pill.svg\",\n            \"title\": \"БЭМ-пилюлька\",\n            \"category\": \"другое\",\n            \"price\": 1500\n        },\n        {\n            \"id\": \"54df7dcb-1213-4b3c-ab61-92ed5f845535\",\n            \"description\": \"Измените локацию для поиска работы.\",\n            \"image\": \"/Polygon.svg\",\n            \"title\": \"Портативный телепорт\",\n            \"category\": \"другое\",\n            \"price\": 100000\n        },\n        {\n            \"id\": \"6a834fb8-350a-440c-ab55-d0e9b959b6e3\",\n            \"description\": \"Даст время для изучения React, ООП и бэкенда\",\n            \"image\": \"/Butterfly.svg\",\n            \"title\": \"Микровселенная в кармане\",\n            \"category\": \"другое\",\n            \"price\": 750\n        },\n        {\n            \"id\": \"48e86fc0-ca99-4e13-b164-b98d65928b53\",\n            \"description\": \"Очень полезный навык для фронтендера. Без шуток.\",\n            \"image\": \"Leaf.svg\",\n            \"title\": \"UI/UX-карандаш\",\n            \"category\": \"хард-скил\",\n            \"price\": 10000\n        },\n        {\n            \"id\": \"90973ae5-285c-4b6f-a6d0-65d1d760b102\",\n            \"description\": \"Сжимайте мячик, чтобы снизить стресс от тем по бэкенду.\",\n            \"image\": \"/Mithosis.svg\",\n            \"title\": \"Бэкенд-антистресс\",\n            \"category\": \"другое\",\n            \"price\": 1000\n        }\n    ]\n}";
    }
} 
