public class CifraDeCesar {

    public static String criptografar (String mensagem, int chave){
        StringBuilder mensagemCriptografada = new StringBuilder();

        for (int i = 0; i < mensagem.length(); i ++){
            char c = mensagem.charAt(i);

            if (c >= 'A' && c <= 'Z'){
                c = (char)(c + chave);
                if(c > 'Z'){
                    c = (char) (c - 26);
                }
            }


            mensagemCriptografada.append(c);
        }

        return mensagemCriptografada.toString();
    }

    public static String decodificar (String mensagem, int chave) {

        StringBuilder mensagemDecodificada = new StringBuilder();

            for(int i = 0; i < mensagem.length(); i ++){
                char c = mensagem.charAt(i);

                if (c >= 'A' && c <= 'Z'){
                    c = (char)(c - chave);
                    if (c < 'A'){
                        c = (char) (c + 26);
                    }
                }
                

                mensagemDecodificada.append(c);
            }

            return mensagemDecodificada.toString();

    }


}
