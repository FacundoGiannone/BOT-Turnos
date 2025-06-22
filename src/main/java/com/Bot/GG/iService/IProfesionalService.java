package com.Bot.GG.iService;

import java.util.List;
import com.Bot.GG.entity.Profesional;

public interface IProfesionalService {
	public List<Profesional> findAllProfesional();
    public Profesional saveProfesional(Profesional profesional);
    public void removeProfesional(Profesional profesional);


}
