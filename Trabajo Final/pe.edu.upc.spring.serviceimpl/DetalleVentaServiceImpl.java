package pe.edu.upc.spring.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import pe.edu.upc.spring.repository.IDetalleVentaRepository;

import pe.edu.upc.spring.service.IDetalleVentaService;

import pe.edu.upc.spring.model.DetalleVenta;



@Service
public class DetalleVentaServiceImpl implements IDetalleVentaService{

	@Autowired
	private IDetalleVentaRepository dD;

	@Override
	@Transactional
	public boolean insertar(DetalleVenta detalleventa) {
		DetalleVenta objDetalle = dD.save(detalleventa);
		if (objDetalle == null)
			return false;
		else
			return true;		
	}

	@Override
	public List<DetalleVenta> listar() {
		return dD.findAll();
	}

	@Override
	public void eliminar(int idDetalleVenta) {
		dD.deleteById(idDetalleVenta);		
	}
	
	@Override
	public boolean update(DetalleVenta detalleventa) {
		boolean flag = false;
		try {
			dD.save(detalleventa);
			flag = true;
		}
		catch(Exception ex) {
			System.out.println("Ocurrio un error");
		}
		return flag;
	}

	@Override
	@Transactional(readOnly = true)
	public Optional<DetalleVenta> listarId(int idDetalleVenta) {
		return  dD.findById(idDetalleVenta);
	}

	@Override
	public List<DetalleVenta> buscarIdDetalle(int idDetalleVenta) {
		return  dD.buscarporIdVenta(idDetalleVenta);
	}

	@Override
	public List<DetalleVenta> buscarporIdVenta(int idVenta) {
		return dD.buscarporIdVenta(idVenta);
	}

}
