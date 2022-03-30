import { ComponentFixture, TestBed } from '@angular/core/testing';

import { BumpBarComponent } from './bump-bar.component';

describe('BumpBarComponent', () => {
  let component: BumpBarComponent;
  let fixture: ComponentFixture<BumpBarComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ BumpBarComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(BumpBarComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
