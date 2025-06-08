package br.com.fiap.alagaqui.config;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

import java.io.IOException;

public class CustomDoubleSerializer extends JsonSerializer<Double> {

    @Override
    public void serialize(Double value, JsonGenerator gen, SerializerProvider serializers) throws IOException {
        // Aqui você apenas escreve o número sem aplicar formatação ou arredondamento
        gen.writeNumber(value);  // Escreve o valor original sem alteração
    }
}