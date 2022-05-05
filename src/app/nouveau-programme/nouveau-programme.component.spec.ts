import { ComponentFixture, TestBed } from '@angular/core/testing';

import { NouveauProgrammeComponent } from './nouveau-programme.component';

describe('NouveauProgrammeComponent', () => {
  let component: NouveauProgrammeComponent;
  let fixture: ComponentFixture<NouveauProgrammeComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ NouveauProgrammeComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(NouveauProgrammeComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
