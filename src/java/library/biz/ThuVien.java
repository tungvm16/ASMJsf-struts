/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library.biz;

import java.util.HashMap;
import java.util.Map;
import library.entity.Sach;

/**
 *
 * @author T-ash
 */
public class ThuVien {

    private final Map<Sach, Integer> sach = new HashMap<Sach, Integer>();

    public ThuVien() {
    }
    
    public Map<Sach, Integer> getSach() {
        return sach;
    }
    
}
