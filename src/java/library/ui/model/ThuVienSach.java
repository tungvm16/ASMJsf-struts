/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library.ui.model;

import com.opensymphony.xwork2.ActionSupport;
import java.util.List;
import library.da.QuanLySach;
import library.entity.Sach;

/**
 *
 * @author T-ash
 */
public class ThuVienSach extends ActionSupport{
    private String keyword;
    private List<Sach> sach;

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    public List<Sach> getSach() {
        return sach;
    }

    public void setSach(List<Sach> sach) {
        this.sach = sach;
    }

    @Override
    public String execute() throws Exception {
        sach = new QuanLySach().getSachByMa(keyword);
        return SUCCESS;
    }
    
}
