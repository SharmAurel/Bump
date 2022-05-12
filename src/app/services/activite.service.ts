import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Activite } from '../models/activite.model';
const baseUrl = 'http://localhost:8080/api/tutorials';
@Injectable({
  providedIn: 'root'
})
export class ActiviteService {
  constructor(private http: HttpClient) { }
  getAll(): Observable<Activite[]> {
    return this.http.get<Activite[]>(baseUrl);
  }
  get(id: any): Observable<Activite> {
    return this.http.get(`${baseUrl}/${id}`);
  }
  create(data: any): Observable<any> {
    return this.http.post(baseUrl, data);
  }
  update(id: any, data: any): Observable<any> {
    return this.http.put(`${baseUrl}/${id}`, data);
  }
  delete(id: any): Observable<any> {
    return this.http.delete(`${baseUrl}/${id}`);
  }
  deleteAll(): Observable<any> {
    return this.http.delete(baseUrl);
  }
  findByName(nom: any): Observable<Activite[]> {
    return this.http.get<Activite[]>(`${baseUrl}?nom=${nom}`);
  }
}