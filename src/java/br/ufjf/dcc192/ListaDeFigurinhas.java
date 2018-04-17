package br.ufjf.dcc192;

import java.util.ArrayList;
import java.util.List;

public class ListaDeFigurinhas {
    private static List<Figurinha> figurinhas;
    
    public static List<Figurinha> getInstance() {
        if(figurinhas == null) {
            figurinhas = new ArrayList<>();
            
            figurinhas.add(new Figurinha("Neymar"));
            figurinhas.add(new Figurinha("Cristiano Ronaldo"));
            figurinhas.add(new Figurinha("Messi"));
        }
        return figurinhas;
    }
}
