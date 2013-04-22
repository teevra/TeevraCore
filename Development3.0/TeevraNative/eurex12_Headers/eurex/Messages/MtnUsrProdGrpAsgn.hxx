/* Generated by Xgen from: E100.03.03 SIR 71694 on: 2007-03-07 15:03 */
/*******************************************************************************
* 2007 (c) Copyright Eurex (R) Zuerich AG, Eurex (R) Frankfurt AG
********************************************************************************
*
*  FILE NAME:   MtnUsrProdGrpAsgn.hxx
*
*  DESCRIPTION: Layouts used for
*               Maintain User Product Group Assignment
*
*******************************************************************************/

#ifndef _MTNUSRPRODGRPASGN_HXX_
#define _MTNUSRPRODGRPASGN_HXX_

#if defined(__cplusplus) || defined(c_plusplus)
extern "C" {
#endif

/******************************************************************************/

#include <DRIV_common_structs.hxx>
#include <DRIV_data_types.hxx>

/******************************************************************************/


/******************************************************************************/

#ifndef _BSC_MTN_USR_PROD_GRP_ASGN_REQUEST_T_
#define _BSC_MTN_USR_PROD_GRP_ASGN_REQUEST_T_

typedef struct bscMtnUsrProdGrpAsgnRequestTag
{
    char             actnCod;
    char             membExchIdCod   [MEMB_EXCH_ID_COD_LEN];
    trdrIdGrpT       trdrIdGrp;
    prodGrpIdGrpT    prodGrpIdGrp;
    char             maxOrdrQty      [DRIV_VOLUME_LEN];
    char             maxCalSprdQty   [DRIV_VOLUME_LEN];
    char             maxWhsQty       [DRIV_VOLUME_LEN];
    char             dateLstUpdDat   [DRIV_TIMESTAMP_LEN];
} bscMtnUsrProdGrpAsgnRequestT, *pBscMtnUsrProdGrpAsgnRequestT;

#endif  /* _BSC_MTN_USR_PROD_GRP_ASGN_REQUEST_T_ */

/******************************************************************************/

#ifndef _MTN_USR_PROD_GRP_ASGN_REQUEST_T_
#define _MTN_USR_PROD_GRP_ASGN_REQUEST_T_

typedef struct mtnUsrProdGrpAsgnRequestTag
{
    dataHeaderT      header;
    bscMtnUsrProdGrpAsgnRequestT basic;
} mtnUsrProdGrpAsgnRequestT, *pMtnUsrProdGrpAsgnRequestT;

#endif  /* _MTN_USR_PROD_GRP_ASGN_REQUEST_T_ */

/******************************************************************************/

#ifndef _BSC_MTN_USR_PROD_GRP_ASGN_RESPONSE_T_
#define _BSC_MTN_USR_PROD_GRP_ASGN_RESPONSE_T_

typedef struct bscMtnUsrProdGrpAsgnResponseTag
{
    char             dateLstUpdDat   [DRIV_TIMESTAMP_LEN];
} bscMtnUsrProdGrpAsgnResponseT, *pBscMtnUsrProdGrpAsgnResponseT;

#endif  /* _BSC_MTN_USR_PROD_GRP_ASGN_RESPONSE_T_ */

/******************************************************************************/

#ifndef _MTN_USR_PROD_GRP_ASGN_RESPONSE_T_
#define _MTN_USR_PROD_GRP_ASGN_RESPONSE_T_

typedef struct mtnUsrProdGrpAsgnResponseTag
{
    dataHeaderT      header;
    bscMtnUsrProdGrpAsgnResponseT basic;
} mtnUsrProdGrpAsgnResponseT, *pMtnUsrProdGrpAsgnResponseT;

#endif  /* _MTN_USR_PROD_GRP_ASGN_RESPONSE_T_ */

/******************************************************************************/

#if defined(__cplusplus) || defined(c_plusplus)
} /* close scope of 'extern "C"' declaration which encloses file. */
#endif

#endif /* _MTNUSRPRODGRPASGN_HXX_ */

/******************************************************************************/
/* End of file MtnUsrProdGrpAsgn.hxx */
/******************************************************************************/
