import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class GuardaCep {


    public void guardaMaisdeUmCep(List<Cep> listaCep){
        for (Cep cep : listaCep){
                try{
                    Gson gson = new GsonBuilder().setPrettyPrinting().create();
                    FileWriter escrita = new FileWriter("Vários Ceps");
                    escrita.write(gson.toJson(listaCep));
                    escrita.close();
                }catch (IOException e){
                    System.out.println("Erro ao criar escrita");
                    System.out.println(e.getMessage());
                }
            }
    }

}
