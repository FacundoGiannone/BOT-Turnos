package com.Bot.GG.iService;

import java.util.List;
import com.Bot.GG.entity.Turno;


public interface ITurnoService {
	public List<Turno> findAllTurno();
    public Turno saveTurno(Turno turno);
    public void removeTurno(Turno turno);

}
