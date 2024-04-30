import { Component, OnInit } from '@angular/core';
import { LapsService } from '../../../laps.service';
import { ActivatedRoute, Router } from '@angular/router';

@Component({
  selector: 'app-actualizar-equipo',
  templateUrl: './actualizar-equipo.page.html',
  styleUrls: ['./actualizar-equipo.page.scss'],
})
export class ActualizarEquipoPage implements OnInit {

  constructor(
    private minfoPcService : LapsService,
    private router : Router,
    private activatedRoute: ActivatedRoute
  ) {
    this.activatedRoute.params.subscribe((params:any)=>{
      this.id = params.id_equipo;
      this.getLap(this.id);
    })
   }

  ngOnInit() {
  }
  id: any;
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

  getLap(id:any){
    this.minfoPcService.getLap(id).subscribe((data:any)=>{
      this.id = data[0].id;
      this.nombre = data[0].nombre;
      this.modelo = data[0].modelo;
      this.tipo = data[0].tipo;
      this.procesador = data[0].procesador;
      this.ram = data[0].ram;
      this.almacenamiento = data[0].almacenamiento;
      this.grafica = data[0].grafica;
      this.tasaRefresco = data[0].tasaRefresco;
      this.motherboard = data[0].motherboard;
      this.imagen = data[0].imagen;
    })
  }

  updateLap(){
    let data = {
      id: this.id,
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
    console.log("datos a enviar",data);
    this.minfoPcService.updateLap(data).subscribe((res:any)=>{
      console.log("Actualizado",res);
      this.router.navigate(['/info-id']);
    },(err:any)=>{
      console.log(err);
    });
  }


}
