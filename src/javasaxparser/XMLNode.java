/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javasaxparser;

import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author NicoleDillon
 */
public class XMLNode {
    public String key;
    public String value;
    public HashMap<String, String> attributes;
    public ArrayList<XMLNode> children;
    
     public XMLNode() {}

}
