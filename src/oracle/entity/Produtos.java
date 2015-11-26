package oracle.entity;
// Generated Nov 24, 2015 9:05:40 AM by Hibernate Tools 3.6.0


import java.math.BigDecimal;

/**

 */
public class Produtos  implements java.io.Serializable {


     private String codigo;
     private String descricion;
     private BigDecimal prezo;

    public Produtos() {
    }

	
    public Produtos(String codigo) {
        this.codigo = codigo;
    }
    public Produtos(String codigo, String descricion, BigDecimal prezo) {
       this.codigo = codigo;
       this.descricion = descricion;
       this.prezo = prezo;
    }
   
    public String getCodigo() {
        return this.codigo;
    }
    
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    public String getDescricion() {
        return this.descricion;
    }
    
    public void setDescricion(String descricion) {
        this.descricion = descricion;
    }
    public BigDecimal getPrezo() {
        return this.prezo;
    }
    
    public void setPrezo(BigDecimal prezo) {
        this.prezo = prezo;
    }




}


