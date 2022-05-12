import { Component, OnInit } from '@angular/core';
import { Activite } from 'src/app/models/activite.model';
import { ActiviteService } from 'src/app/services/activite.service';
@Component({
  selector: 'app-mes-programmes',
  templateUrl: './mes-programmes.component.html',
  styleUrls: ['./mes-programmes.component.css']
})
export class MesProgrammesComponent implements OnInit {

  activites?: Activite[];
  currentActivite: Activite = {};
  currentIndex = -1;
  nom= '';
  materiel= '' ;
  difficulte='' ;
  muscle_primaire='';
  muscle_secondaire='';
  duree= 4;

  constructor(private activiteService: ActiviteService) { }
  ngOnInit(): void {
    this.retrieveActivites();
  }
  retrieveActivites(): void {
    this.activiteService.getAll()
      .subscribe(
        data => {
          this.activites = data;
          console.log(data);
        },
        error => {
          console.log(error);
        });
  }
  refreshList(): void {
    this.retrieveActivites();
    this.currentActivite = {};
    this.currentIndex = -1;
  }
  setActiveActivite(activite: Activite, index: number): void {
    this.currentActivite = activite;
    this.currentIndex = index;
  }
  removeAllActivites(): void {
    this.activiteService.deleteAll()
      .subscribe(
        response => {
          console.log(response);
          this.refreshList();
        },
        error => {
          console.log(error);
        });
  }
  searchTitle(): void {
    this.currentActivite = {};
    this.currentIndex = -1;
    this.activiteService.findByName(this.nom)
      .subscribe(
        data => {
          this.activites = data;
          console.log(data);
        },
        error => {
          console.log(error);
        });
  }
}
