import com.google.gson.annotations.SerializedName;

public record Cep(String cep, String logradouro, String bairro, @SerializedName("localidade") String cidade, String estado){


}
