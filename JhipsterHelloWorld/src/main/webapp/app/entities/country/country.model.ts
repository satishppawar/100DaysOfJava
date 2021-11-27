export interface ICountry {
  id?: number;
  name?: string | null;
  population?: number | null;
}

export class Country implements ICountry {
  constructor(public id?: number, public name?: string | null, public population?: number | null) {}
}

export function getCountryIdentifier(country: ICountry): number | undefined {
  return country.id;
}
