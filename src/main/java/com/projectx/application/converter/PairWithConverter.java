package com.projectx.application.converter;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import com.projectx.application.dto.PairWithDTO;
import com.projectx.application.model.PairWith;

@Component
public class PairWithConverter {
	
	public PairWithDTO entityToDTO(PairWith entity){
		
		ModelMapper mapper = new ModelMapper();
		return mapper.map(entity, PairWithDTO.class);
	}
	
	public List<PairWithDTO> entityToDTO(List<PairWith> entity){
		return entity.stream().map(x -> entityToDTO(x)).collect(Collectors.toList());
	}
	
	public PairWith dtoToEntity(PairWithDTO dto) {
		ModelMapper mapper = new ModelMapper();
		return mapper.map(dto, PairWith.class);
	}
	
	public List<PairWith> dtoToEntity(List<PairWithDTO> dto){
		return dto.stream().map(x -> dtoToEntity(x)).collect(Collectors.toList());
	}
}
