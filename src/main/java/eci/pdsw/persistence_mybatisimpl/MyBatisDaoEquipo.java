/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eci.pdsw.persistence_mybatisimpl;

import eci.pdsw.entities.Equipo;
import eci.pdsw.entities.EquipoBasico;
import eci.pdsw.entities.Modelo;
import eci.pdsw.mybatis.mappers.EquipoMapper;
import org.apache.ibatis.session.SqlSession;
import eci.pdsw.persistence.DaoEquipo;

/**
 *
 * @author 2107262
 */
public class MyBatisDaoEquipo implements DaoEquipo{
    private EquipoMapper emap=null;

    public MyBatisDaoEquipo(SqlSession session) {        
        emap=session.getMapper(EquipoMapper.class);
    }
    @Override
    public void registroEquipoNuevo(Equipo e) {
        emap.registrarEquipoNuevo(e);
    }

    @Override
    public void registrarModeloNuevo(Modelo m) {
        emap.registrarModeloNuevo(m);
    }

    @Override
    public Modelo loadModeloByName(String nombre) {
        Modelo mod=emap.loadModeloByName(nombre);
        return mod;
    }

    @Override
    public Equipo loadEquipoBySerial(int serial) {
        Equipo eq=emap.loadEquipoBySerial(serial);
        return eq;
    }

    @Override
    public EquipoBasico loadEquipoBasicoByName(String nombre) {
        EquipoBasico eqb=emap.loadEquipoBasicoByName(nombre);
        return eqb;
    }
    
}