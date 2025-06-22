package com.Bot.GG.iService;

import java.util.List;
import com.Bot.GG.entity.Servicio;



public interface IServicioService {
	public List<Servicio> findAllServicio();
    public Servicio saveServicio(Servicio servicio);
    public void removeServicio(Servicio servicio);

}
