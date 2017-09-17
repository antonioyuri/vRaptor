package br.com.bean;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class OlaMundoBean {

  public String getHorario() {
    SimpleDateFormat sdf = new SimpleDateFormat("hh:mm:ss");
    return sdf.format(new Date());
  }
  
  public String getRetorno() {
	  return "Olá Mundo";
  }
  
}
