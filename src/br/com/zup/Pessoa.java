package br.com.zup;

public abstract class Pessoa {
        private String nome;
        private String cpf;

        public Pessoa() {

        }

        public Pessoa(String nome, String cpf) {
            this.nome = nome;
            this.cpf = cpf;
        }

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public String getCpf() {
            return cpf;
        }

        public void setCpf(String cpf) {
            this.cpf = cpf;
        }

        @Override
        public String toString() {
            StringBuilder retorno = new StringBuilder();
            retorno.append("Nome: " + nome + ".");
            retorno.append("\t CPF: " + cpf + ".");
            return retorno.toString();
        }
}
