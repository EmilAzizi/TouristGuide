package com.example.touristguide.service;

import com.example.touristguide.model.TouristAttraction;
import com.example.touristguide.repository.TouristRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TouristService {
    TouristRepository touristRepository;

    public TouristService(){
        this.touristRepository = new TouristRepository();
    }
    public List<TouristAttraction> getAttractions(){
        touristRepository.getTouristAttractions();
        List<TouristAttraction> touristAttractions = touristRepository.getTouristAttractions();
        return touristAttractions;
    }

    public TouristAttraction getTouristAttraction(int id){
        return touristRepository.getTouristAttraction(id);
    }

    public TouristAttraction postNewAttraction(TouristAttraction touristAttraction){
        touristRepository.addAttractions(touristAttraction);
        return touristAttraction;
    }

    public TouristAttraction putTouristAttraction(TouristAttraction touristAttraction){
        TouristAttraction returnTouristAttraction = touristRepository.
    }
}
