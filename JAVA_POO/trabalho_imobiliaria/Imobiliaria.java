// KAUAN FELIPE DA SILVA - 40809013


public class Imobiliaria {
    private String nome;
    private Pessoa[] pessoas = new Pessoa[100];
    private Imovel[] imoveis = new Imovel[100];
    private Contrato[] contratos = new Contrato[100];
    
    public void incluiPessoa(Pessoa pessoa) {
        for (int i = 0; i < pessoas.length; i++) {
            if (pessoas[i] == null) {
                pessoas[i] = pessoa;
                break;
            } 
        }
    }
    
    public void incluiImovel(Imovel imovel) {
        for (int i = 0; i < imoveis.length; i++) {
            if (imoveis[i] == null) {
                imoveis[i] = imovel;
                break;
            } 
        }
    }
    
    public void incluiContrato(Contrato contrato) {
        for (int i = 0; i < contratos.length; i++) {
            if (contratos[i] == null) {
                contratos[i] = contrato;
                break;
            } 
        }
    }
    
    
    public void retirarPessoa(Pessoa pessoa) {
        for (int i = 0; i < pessoas.length; i++) {
            if(pessoas[i] != null && pessoas[i].getCpf().equals(pessoa.getCpf())) {
                pessoas[i] = null;
                break;
            }
        }
    }
    
    
    public void retirarImovel(Imovel imovel) {
        for (int i = 0; i < imoveis.length; i++) {
            if(imoveis[i] != null && imoveis[i].getIdImovel() == imovel.getIdImovel()) {
                imoveis[i] = null;
                break;
            }
        }
    }
    
    public void retirarContrato(Contrato contrato) {
        for (int i = 0; i < contratos.length; i++) {
            if(contratos[i] != null && contratos[i].getImovel().getIdImovel() == contrato.getImovel().getIdImovel()) {
                contratos[i] = null;
                break;
            }
        }
    }
    
    
    public void buscarPessoa(Pessoa pessoa) {
       for (int i = 0; i < pessoas.length; i++) {
          if (pessoas[i] != null) {
              if (pessoas[i].getCpf().equals(pessoa.getCpf())) {
                  pessoas[i].mostraDados();
              }
          }
       }
    }
    
    public void buscarImovel(Imovel imovel) {
       for (int i = 0; i < imoveis.length; i++) {
          if (imoveis[i] != null) {
              if (imoveis[i].getIdImovel() == imovel.getIdImovel()) {
                  imoveis[i].mostraDados();
              }
          }
       }
    }
    
    public void buscarContrato(Contrato contrato) {
       for (int i = 0; i < contratos.length; i++) {
          if (contratos[i] != null) {
              if (contratos[i].getImovel().getIdImovel() == contrato.getImovel().getIdImovel()) {
                  contratos[i].mostraDados();
              }
          }
       }
    }
    
    public void mostraDadosPessoa() {
        for (int i = 0; i < pessoas.length; i++) {
            pessoas[i].mostraDados();
        }
    }
    
    public void mostraDadosImovel() {
        for (int i = 0; i < imoveis.length; i++) {
            imoveis[i].mostraDados();
        }
    }
    
    public void mostraDadosContrato() {
        for (int i = 0; i < contratos.length; i++) {
            contratos[i].mostraDados();
        }
    }
    
    // mostra todos os dados ao mesmo tempo.
    public void mostraDados() {
        for (int i = 0; i < pessoas.length; i++) {
            pessoas[i].mostraDados();
        }
        for (int i = 0; i < imoveis.length; i++) {
            imoveis[i].mostraDados();
        }
        for (int i = 0; i < contratos.length; i++) {
            contratos[i].mostraDados();
        }
    }

    public void processarMensalidades() {
        for (int i = 0; i < contratos.length; i++) {
            if (contratos[i] != null) {
            contratos[i].processarMensalidade();
            }
        }
    }
    
}