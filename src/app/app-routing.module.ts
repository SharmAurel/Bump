import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { HomeComponent } from './home/home.component';
import { ConnexionComponent } from './connexion/connexion.component';
import { InscriptionComponent } from './inscription/inscription.component';
import { NouveauProgrammeComponent } from './nouveau-programme/nouveau-programme.component';
import { MesProgrammesComponent } from './mes-programmes/mes-programmes.component';


const routes: Routes = [{path : "", component: HomeComponent},
{path : "connexion", component: ConnexionComponent},
{path : "inscription", component: InscriptionComponent},
{path : "nouveau-programme", component: NouveauProgrammeComponent},
{path : "mes-programmes", component: MesProgrammesComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
