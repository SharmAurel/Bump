import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { BumpBarComponent } from './bump-bar/bump-bar.component';
import { HomeComponent } from './home/home.component';
import { UserBarComponent } from './user-bar/user-bar.component';
import { DownBarComponent } from './down-bar/down-bar.component';
import { ConnexionComponent } from './connexion/connexion.component';

@NgModule({
  declarations: [
    AppComponent,
    BumpBarComponent,
    HomeComponent,
    UserBarComponent,
    DownBarComponent,
    ConnexionComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
