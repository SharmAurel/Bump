import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Entrainement } from '../models/entrainement.model';
const baseUrl = 'http://localhost:8080/api/tutorials';
@Injectable({
  providedIn: 'root'
})
export class EntrainementService {
  constructor(private http: HttpClient) { }
  getAll(): Observable<Entrainement[]> {
    return this.http.get<Entrainement[]>(baseUrl);
  }
  get(id: any): Observable<Entrainement> {
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
  findById(id: any): Observable<Entrainement[]> {
    return this.http.get<Entrainement[]>(`${baseUrl}?id=${id}`);
  }
}