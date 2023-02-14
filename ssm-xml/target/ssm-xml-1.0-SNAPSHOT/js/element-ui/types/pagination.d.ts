import { ElementUIComponent } from './component'

/** Pagination Component */
export declare class ElPagination extends ElementUIComponent {
  /** Whether to use small pagination */
  small: boolean

  /** Item count of each Page */
  pageSize: number

  /** Total item count */
  total: number

  /** Total Page count. Set either total or Page-count and pages will be displayed; if you need Page-sizes, total is required */
  pageCount: number

  /** Number of pagers */
  pagerCount: number

  /** Current Page number */
  currentPage: number

  /**
   * Layout of Pagination. Elements separated with a comma.
   * Accepted values: `sizes`, `prev`, `pager`, `next`, `jumper`, `->`, `total`, `slot`
   */
  layout: string

  /** Options of item count per Page */
  pageSizes: number[]

  /** Custom class name for the Page size Select's dropdown */
  popperClass: string

  /** Text for the prev button */
  prevText: string

  /** Text for the prev button */
  nextText: string

  /** Whether to hide when thers's only one Page */
  hideOnSinglePage: boolean
}
