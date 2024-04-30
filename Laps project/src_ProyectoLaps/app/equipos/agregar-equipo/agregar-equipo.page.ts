import { Component, OnInit } from '@angular/core';
import { LapsService } from '../../../laps.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-agregar-equipo',
  templateUrl: './agregar-equipo.page.html',
  styleUrls: ['./agregar-equipo.page.scss'],
})
export class AgregarEquipoPage implements OnInit {

  constructor(
    private minfoPcService : LapsService,
    private router : Router,
  ) { }

  ngOnInit() {
  }
  nombre : any;
  modelo: any;
  tipo: any;
  procesador: any;
  ram: any;
  almacenamiento: any;
  grafica: any;
  tasaRefresco: any;
  motherboard: any;
  imagen: any;
  
  insertLap(){
    let data ={
      nombre: this.nombre,
      modelo: this.modelo,
      tipo: this.tipo,
      procesador: this.procesador,
      ram: this.ram,
      almacenamiento: this.almacenamiento,
      grafica: this.grafica,
      tasaRefresco: this.tasaRefresco,
      motherboard: this.motherboard,
      imagen: this.imagen
    }
    console.log(data);
    this.minfoPcService.insertLap(data).subscribe(
      (res:any)=>{
        console.log("Agregado",res);
        this.menu();
        this.minfoPcService.getLaps();
        this.nombre="";
        this.modelo= "";
        this.tipo= "";
        this.procesador="";
        this.ram="";
        this.almacenamiento="";
        this.grafica="";
        this.tasaRefresco="";
        this.motherboard="";
        this.imagen=""; 
      },(error:any)=>{
        console.log("Error",error);
      }
    )
  }

  menu(){
    this.router.navigate(['info-id']);
  }

}
