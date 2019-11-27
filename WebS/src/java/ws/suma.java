/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author ederb
 */
@WebService(serviceName = "suma")
public class suma {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "contar")
    public Integer suma(@WebParam(name = "hitsCount") Integer hitsCount) {
        
        if(hitsCount == null){
            hitsCount = 0;
        }
        return hitsCount + 1;
    }
}
