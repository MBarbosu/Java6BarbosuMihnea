/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tdd;

/**
 *
 * @author SkullFlight
 */
public class Circle extends F2D {
    
    private String definitionCircle = " whose boundary(the circumference) consists of points equidistant from a fixed point(the center)";
    private String definitionCircle2 = "Circle: ";
    
      @Override
      public String getDefinition(){
        StringBuffer response = new StringBuffer(definitionCircle2);
        response.append(super.getDefinition());
        response.append(super.getDefinition2D());
        response.append(definitionCircle);
        return(response.toString());
      } 
       public void setDefinitionCircle(String s)
       {
         definitionCircle  = s;
        
       }
       public String getDefinitionCircle()
       {
        return definitionCircle;
       }
}

