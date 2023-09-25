package br.com.curriculo.Curriculo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("curriculo")
public class CurriculoController {


    @GetMapping("/dados")
    public ModelAndView dadosPesssoaiss(){
        ModelAndView x = new ModelAndView("index");
        x.addObject("nomeCompleto", "Micael Dos Santos Oliveira");
        x.addObject("email", "micaelds98@outlook.com");
        x.addObject("dataNasc", "02/12/1998");
        x.addObject("linkedin", "https://www.linkedin.com/in/micael-oliveira-38a623232/");
        x.addObject("github", "https://github.com/MicaelOliveira12");
        x.addObject("curso1", "Informatica Basico");
        x.addObject("infoCurso1","Pacote Office, Html, Css, Redes, Internet, Photoshop, Digitação");
        x.addObject("curso2", "Manutenção de Micros (Hardware)");
        x.addObject("infoCurso2","");
        x.addObject("curso3", "Analise e Desenvolvimento de Sistemas");
        x.addObject("infoCurso3","Desenvolvimento BackEnd (Java), Desonvolvimento Web, Projeto Integrador, Algoritimos, Banco de Dados, Engenharia de Software, Arquitetura de Software, Testes de Software");
        x.addObject("empresa","Nexcode Systems");
        x.addObject("cargo","Tecnico de Informatica Pleno");
        x.addObject("atividade","Manutenção geral em equipamentos de segurança eletronica");
        x.addObject("periodo","Atuando há 4 anos");
        x.addObject("idioma1","Português (Nativo)");
        x.addObject("idioma2","Inglês Básico");
        return x;


    }

}
