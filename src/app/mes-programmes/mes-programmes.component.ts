import { Component, OnInit } from '@angular/core';
import { Entrainement } from 'src/app/models/entrainement.model';
import { EntrainementService } from 'src/app/services/entrainement.service';
import { Activite } from '../models/activite.model';
@Component({
  selector: 'app-mes-programmes',
  templateUrl: './mes-programmes.component.html',
  styleUrls: ['./mes-programmes.component.css']
})
export class MesProgrammesComponent implements OnInit {

  entrainements?: Entrainement[];
  activite1: Activite ={
    id: 1,
    nom: 'dev couche haltere',
    materiel: 'halteres',
    difficulte: 'intermediaire',
    muscle_primaire: 'pectoraux',
    muscle_secondaire:'triceps',
    duree:5

  }
  activite2: Activite ={
    id: 2,
    nom: 'traction',
    materiel: 'barre_traction',
    difficulte: 'difficle',
    muscle_primaire: 'dorsaux',
    muscle_secondaire:'biceps',
    duree:5

  }
  currentEntrainement: Entrainement = {
    id:'1',
    duree:600,
    activites:[this.activite1,this.activite2]
  };
  currentIndex = -1;
  id='';
  duree='';
  activites='';

  constructor(private entrainementService: EntrainementService) { }
  ngOnInit(): void {
    this.retrieveEntrainements();
  }
  retrieveEntrainements(): void {
    this.entrainementService.getAll()
      .subscribe(
        data => {
          this.entrainements = data;
          console.log(data);
        },
        error => {
          console.log(error);
        });
  }
  refreshList(): void {
    this.retrieveEntrainements();
    this.currentEntrainement = {};
    this.currentIndex = -1;
  }
  setActiveEntrainement(entrainement: Entrainement, index: number): void {
    this.currentEntrainement = entrainement;
    this.currentIndex = index;
  }
  removeAllEntrainements(): void {
    this.entrainementService.deleteAll()
      .subscribe(
        response => {
          console.log(response);
          this.refreshList();
        },
        error => {
          console.log(error);
        });
  }
  
}
