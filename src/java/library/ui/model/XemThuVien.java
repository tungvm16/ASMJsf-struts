/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library.ui.model;

import static com.opensymphony.xwork2.Action.ERROR;
import static com.opensymphony.xwork2.Action.SUCCESS;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import java.util.Map;
import library.biz.ThuVien;
import library.entity.Sach;

/**
 *
 * @author T-ash
 */
public class XemThuVien extends ActionSupport{
    private Map<Sach, Integer> sach;

    public Map<Sach, Integer> getSach() {
        return sach;
    }

    @Override
    public String execute() throws Exception {
        ThuVien tv = (ThuVien) ActionContext.getContext().getSession().get("tv");
        if (tv == null){
            return ERROR;
        }
        sach = tv.getSach();
        
        return SUCCESS;
    }
    
}
