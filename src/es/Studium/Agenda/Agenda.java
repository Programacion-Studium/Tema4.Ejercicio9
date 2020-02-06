package es.Studium.Agenda;

import java.awt.Dialog;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
public class Agenda extends Frame implements WindowListener, ActionListener
{
	private static final long serialVersionUID = 1L;
	MenuBar barraMenu = new MenuBar();
	Menu agendadecitas = new Menu("Agenda de Citas");
	Menu eventos = new Menu("Eventos");
	Menu libretadedirecciones = new Menu("Libreta de Direcciones");
	MenuItem agendadecitasNuevo = new MenuItem("Elemento Nuevo");
	MenuItem agendadecitasEliminar = new MenuItem("Eliminar una Existente");
	MenuItem agendadecitasConsultar = new MenuItem("Consultar las Existentes");
	MenuItem agendadecitasModificar = new MenuItem("Modificar Cita");
	MenuItem eventoNuevo = new MenuItem("Evento Nuevo");
	MenuItem eventoEliminar = new MenuItem("Eliminar Evento");
	MenuItem eventoConsultar = new MenuItem("Consultar Evento");
	MenuItem eventoModificar = new MenuItem("Modificar Evento");
	MenuItem libretadedireccionesNueva = new MenuItem("Nueva Dirección");
	MenuItem libretadedireccionesEliminar = new MenuItem("Eliminar Dirección");
	MenuItem libretadedireccionesConsultar = new MenuItem("Consultar Dirección");
	MenuItem libretadedireccionesModificar = new MenuItem("Modificar Dirección");
	Dialog d = new Dialog(this, "Diálogo con mensaje", true);
	Label e = new Label("");
	public Agenda()
	{
		setLayout(new FlowLayout());
		setTitle("Agenda");
		setMenuBar(barraMenu);
		agendadecitas.add(agendadecitasNuevo);
		agendadecitas.add(agendadecitasEliminar);
		agendadecitas.add(agendadecitasConsultar);
		agendadecitas.add(agendadecitasModificar);
		agendadecitasNuevo.addActionListener(this);
		agendadecitasEliminar.addActionListener(this);
		agendadecitasConsultar.addActionListener(this);
		agendadecitasModificar.addActionListener(this);
		eventos.add(eventoNuevo);	
		eventos.add(eventoEliminar);
		eventos.add(eventoConsultar);
		eventos.add(eventoModificar);
		eventoNuevo.addActionListener(this);
		eventoEliminar.addActionListener(this);
		eventoConsultar.addActionListener(this);
		eventoModificar.addActionListener(this);
		libretadedirecciones.add(libretadedireccionesNueva);
		libretadedirecciones.add(libretadedireccionesEliminar);
		libretadedirecciones.add(libretadedireccionesConsultar);
		libretadedirecciones.add(libretadedireccionesModificar);
		libretadedireccionesNueva.addActionListener(this);
		libretadedireccionesEliminar.addActionListener(this);
		libretadedireccionesConsultar.addActionListener(this);
		libretadedireccionesModificar.addActionListener(this);
		barraMenu.add(agendadecitas);
		barraMenu.add(eventos);
		barraMenu.add(libretadedirecciones);
		addWindowListener(this);
		d.setLayout(new FlowLayout());
		d.setSize(200,150);
		//Para poder cerrar el Diálogo
		d.addWindowListener(this);
		setSize(350,200);
		setVisible(true);
	}
	public static void main(String[] args)
	{
		new Agenda();
	}
	public void windowActivated(WindowEvent we) {}
	public void windowClosed(WindowEvent we) {}
	public void windowClosing(WindowEvent we)
	{
		if(d.hasFocus())
		{
			d.setVisible(false);
		}
		else
		{
			System.exit(0);
		}
	}
	public void windowDeactivated(WindowEvent we) {}
	public void windowDeiconified(WindowEvent we) {}
	public void windowIconified(WindowEvent we) {}
	public void windowOpened(WindowEvent we) {}
	public void actionPerformed(ActionEvent ae)
	{
		Object a;
		a = ae.getSource();
		if(a.equals(agendadecitasNuevo))
		{
			e.setText("Nueva Cita");
		}
		else if(a.equals(agendadecitasEliminar))
		{
			e.setText("Eliminar Cita");
		}
		else if(a.equals(agendadecitasConsultar))
		{
			e.setText("Consultar Cita");
		}
		else if(a.equals(agendadecitasModificar))
		{
			e.setText("Modificar Cita");
		}
		else if(a.equals(eventoNuevo))
		{
			e.setText("Nuevo Evento");
		}
		else if(a.equals(eventoEliminar))
		{
			e.setText("Eliminar Evento");
		}
		else if(a.equals(eventoConsultar))
		{
			e.setText("Consultar Evento");
		}
		else if(a.equals(eventoModificar))
		{
			e.setText("Modificar Evento");
		}
		else if(a.equals(libretadedireccionesNueva))
		{
			e.setText("Nuevo Contacto");
		}
		else if(a.equals(libretadedireccionesEliminar))
		{
			e.setText("Eliminar Contacto");
		}
		else if(a.equals(libretadedireccionesConsultar))
		{
			e.setText("Consultar Contacto");
		}
		else
		{
			e.setText("Modificar Contacto");
		}
		d.add(e);
		d.setVisible(true);
	}
}
